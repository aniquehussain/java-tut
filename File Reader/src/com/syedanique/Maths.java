package com.syedanique;

import com.syedanique.exceptions.Error;

public class Maths {

    public int sub10fromNumber(int num) throws Error {
        if (num < 10){
            throw new Error("Number is less than 10");
        }
        return num - 10;
    }

}
