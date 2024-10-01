package com.example.examen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TranslateServiceTest {

    @Mock
    ApiTranslate apiTranslate;

    @InjectMocks
    TranslateService translateService;

    @Test
    void translate() {
        // Configuración (Arrange)
        String inputText = "Hola";
        String expectedTranslation = "Hello";
        Language sourceLanguage = Language.ES;
        Language targetLanguage = Language.EN;

        when(apiTranslate.translate(inputText, sourceLanguage.toString(), targetLanguage.toString()))
                .thenReturn(expectedTranslation);

        TranslateRequestDto requestDto = new TranslateRequestDto(inputText, sourceLanguage, targetLanguage);

        // Acción (Act)
        String actualTranslation = translateService.translate(requestDto);

        // Verificación (Assert)
        assertEquals(expectedTranslation, actualTranslation, "The translated text should be 'Hello'");
    }
}