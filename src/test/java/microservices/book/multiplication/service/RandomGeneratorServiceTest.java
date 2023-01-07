//package microservices.book.multiplication;
//
//import microservices.book.multiplication.service.RandomGeneratorService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//import static org.assertj.core.api.Assertions.asertThat;
//
//@RunWith(SpringRunner.class)s
//@SpringBootTest
//public class RandomGeneratorServiceTest {
//    @Autowired
//    private RandomGeneratorService randomGeneratorService;
//    @Test
//    public  void generateRandomGeneratedFactorIsBetweenExpectedLimits() throws Exception{
//        List<Integer> randomFactors = IntStream.range(0,1000)
//                .map(i -> randomGeneratorService.generateRandomFactor())
//                .boxed().collect(Collectors.toList());
//        assertThat(randomFactors).containsOnlyElementsOf(
//                IntStream.range(11,100).boxed().collect(Collectors.toList())
//        );
//    }
//}
