package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.service.MultiplicationService;
import microservices.book.multiplication.service.RandomGeneratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceTest {
    @MockBean
    private RandomGeneratorService randomGeneratorService;
    @Autowired
    private MultiplicationService multiplicationService;
    @Test
    public void createRandomMultiplicationTest(){
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);
        Multiplication multiplication = multiplicationService.createRandomMultiplication();
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
//        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
}
