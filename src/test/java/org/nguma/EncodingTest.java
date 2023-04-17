package org.nguma;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {
    @Test
    @DisplayName(value = "TESTING ENCODING FUNCTIONS")
    void encode() {

        //TESTS IF THE USER INPUT IS ENCODED USING THE VALUE OF THE KEY PROVIDED
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Encoding.encode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));}}