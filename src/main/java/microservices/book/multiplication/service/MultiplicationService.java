package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
    /**
     * Generates a random {@link Multiplication} object
     * @return a multiplication of randomly generated numbers
     */
    Multiplication createRandomMultiplication();

    /**
     *
     * @param resultAttempt
     * @return true if the attempt matches the result of multiplication
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
