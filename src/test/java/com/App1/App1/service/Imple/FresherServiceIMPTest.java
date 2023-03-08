package com.App1.App1.service.Imple;
import com.App1.App1.exception.NotFoundException;
import com.App1.App1.exception.NotImplementedException;
import com.App1.App1.model.entity.Fresher;
import com.App1.App1.model.response.Transcript;
import com.App1.App1.repositories.FresherRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FresherServiceIMPTest {
    @Mock
    FresherRepository fresherRepository;
    @InjectMocks
    FreServiceIMP freServiceIMP;
    private Fresher fresher;

    @BeforeEach
    void setUp(){
        fresher = new Fresher();
        fresher.setFresherId("2019121212");
        fresher.setFresherName("Lala");
        fresher.setFresherAddress("Thai Binh");
        fresher.setFresherPhone("0123123123");
        fresher.setFresherEmail("lala123@gmail.com");
    }
    @DisplayName("JUnit test -- getFresher")
    @Test
    void getAllFresher() {
        List<Fresher> freshers = new ArrayList<>();
        freshers.add(mock(Fresher.class));
        freshers.add(mock(Fresher.class));

        when(fresherRepository.findAll()).thenReturn(freshers);

        List<Fresher> list = freServiceIMP.getAllFresher();
        int size = list.size();
        assertThat(size).isEqualTo(freshers.size());

        verify(fresherRepository).findAll();
    }

    @DisplayName("Junit test -- getTranscript")
    @Test
    void getTranscript() {
        List<Transcript> transcripts = new ArrayList<>();
        transcripts.add(mock(Transcript.class));
        transcripts.add(mock(Transcript.class));

        when(fresherRepository.getTranscript()).thenReturn(transcripts);
        List<Transcript> list = freServiceIMP.getTranscript();
        int size = list.size();
        assertThat(size).isEqualTo(transcripts.size());
        verify(fresherRepository).getTranscript();
    }

    @DisplayName("JUnit test -- addFresher")
    @Test
    void addFresher(){
        given(fresherRepository.save(fresher)).willReturn(fresher);
        Fresher saveFresher = freServiceIMP.addFresher(fresher);
        assertThat(saveFresher).isNotNull();
    }
    @DisplayName("JUnit test addFresher & throws exception")
    @Test()
    void addFresherButException() {
        when(fresherRepository.findById(fresher.getFresherId()))
                .thenReturn(Optional.of(fresher));

        assertThrows(NotImplementedException.class, ()->{
            freServiceIMP.addFresher(fresher);
        });
        verify(fresherRepository, times(1)).findById(fresher.getFresherId());
        verify(fresherRepository, never()).save(any(Fresher.class));
    }

    @DisplayName("JUnit test -- deleteFresher")
    @Test
    void deleteFresher() {
        when(fresherRepository.existsById(fresher.getFresherId()))
                .thenReturn(Boolean.TRUE);
        freServiceIMP.deleteFresher(fresher.getFresherId());
        verify(fresherRepository).deleteById(fresher.getFresherId());
    }
    @DisplayName("JUnit test deleteFresher & throws exception")
    @Test
    void deleteFresherButException() {
        String id = "2019121212";
        when(fresherRepository.existsById(fresher.getFresherId()))
                .thenReturn(Boolean.FALSE);
        assertThrows(NotFoundException.class,()->{
            freServiceIMP.deleteFresher(id);
        });
        verify(fresherRepository,never()).deleteById(id);
    }

    @DisplayName("JUnit test -- searchFresherWithFresherName")
    @Test
    void searchFresherWithFresherName() {
        List<Fresher> freshers = new ArrayList<>();
        freshers.add(mock(Fresher.class));
        freshers.add(mock(Fresher.class));
        when(fresherRepository.findByFresherName(fresher.getFresherName()))
                .thenReturn(freshers);

        List<Fresher> list = freServiceIMP.searchFresherWithFresherName(fresher.getFresherName());
        int size = list.size();
        assertThat(size).isEqualTo(freshers.size());
        verify(fresherRepository).findByFresherName(fresher.getFresherName());
    }

    @DisplayName("JUnit test searchFresherWithFresherName & throws exception")
    @Test
    void searchFresherWithFresherNameButException() {
        String name = fresher.getFresherName();
        List<Fresher> freshers = new ArrayList<>();
        when(fresherRepository.findByFresherName(name))
                .thenReturn(freshers);
        assertThrows(NotFoundException.class,()->{
            freServiceIMP.searchFresherWithFresherName(name);
        });
        verify(fresherRepository, times(1)).findByFresherName(name);
    }

    @DisplayName("JUnit test -- searchFresherWithFresherEmail")
    @Test
    void searchFresherWithFresherEmail() {
        Fresher fresher = mock(Fresher.class);
        when(fresherRepository.findByFresherEmail(fresher.getFresherEmail()))
                .thenReturn(Optional.of(fresher));
        Fresher fresherOptional = freServiceIMP.searchFresherWithFresherEmail(fresher.getFresherEmail());
        assertThat(fresherOptional.getFresherId()).isEqualTo(fresher.getFresherId());
        verify(fresherRepository).findByFresherEmail(fresher.getFresherEmail());
    }

    @DisplayName("JUnit test searchFresherWithFresherEmail & throw exception")
    @Test
    void searchFresherWithFresherEmailButException() {
        String email = fresher.getFresherEmail();
        when(fresherRepository.findByFresherEmail(email))
                .thenReturn(Optional.empty());
        assertThrows(NotFoundException.class,()->{
            freServiceIMP.searchFresherWithFresherEmail(email);
        });
        verify(fresherRepository,times(1)).findByFresherEmail(email);
    }

    @DisplayName("JUnit test -- searchFresherWithID")
    @Test
    void searchFresherWithID() {
        String lp = "JAVA";
        List<Fresher> freshers = new ArrayList<>();
        freshers.add(mock(Fresher.class));
        freshers.add(mock(Fresher.class));
        when(fresherRepository.findByFresherWithLP(lp))
                .thenReturn(freshers);
        List<Fresher> list = freServiceIMP.searchFresherWithLP(lp);
        int size = list.size();
        assertThat(size).isEqualTo(freshers.size());
        verify(fresherRepository).findByFresherWithLP(lp);
    }

    @DisplayName("JUnit test searchFresherWithLP & throw exception")
    @Test
    void searchFresherWithLPButException() {
        String lp = "JAVA";
        List<Fresher> freshers = new ArrayList<>();
        when(fresherRepository.findByFresherWithLP(lp))
                .thenReturn(freshers);
        assertThrows(NotFoundException.class,()->{
            freServiceIMP.searchFresherWithLP(lp);
        });
        verify(fresherRepository,times(1)).findByFresherWithLP(lp);
    }

    @Test
    void editFresher() {
        when(fresherRepository.findById(fresher.getFresherId())).thenReturn(Optional.of(fresher));
        when(fresherRepository.save(fresher)).thenReturn(fresher);
        Fresher newFresher = fresherRepository.findById(fresher.getFresherId())
                .map(f -> {
                    f.setFresherName(fresher.getFresherName());
                    f.setFresherAddress(fresher.getFresherAddress());
                    f.setFresherPhone(fresher.getFresherPhone());
                    f.setFresherEmail(fresher.getFresherEmail());
                    return fresherRepository.save(f);
                }).orElseGet(()-> fresherRepository.save(fresher));
        Fresher upfresher = freServiceIMP.editFresher(fresher);
        assertEquals(upfresher, newFresher);
    }
    @Test
    void editFresherButException() {
        when(fresherRepository.findById(fresher.getFresherId())).thenReturn(Optional.empty());
        when(fresherRepository.save(fresher)).thenReturn(fresher);
        Fresher newFresher = fresherRepository.findById(fresher.getFresherId())
                .map(f -> {
                    f.setFresherName(fresher.getFresherName());
                    f.setFresherAddress(fresher.getFresherAddress());
                    f.setFresherPhone(fresher.getFresherPhone());
                    f.setFresherEmail(fresher.getFresherEmail());
                    return fresherRepository.save(f);
                }).orElseGet(()-> fresherRepository.save(fresher));
        Fresher upfresher = freServiceIMP.editFresher(fresher);
        assertEquals(upfresher, newFresher);
    }
}

