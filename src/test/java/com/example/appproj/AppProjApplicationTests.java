package com.example.appproj;

import com.example.appproj.entity.HotelEntity;
import com.example.appproj.services.HotelService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class AppProjApplicationTests {

    @Test
    void contextLoads() {
    }


    /*public void testaruncaExceptie()
    {
        HotelEntity hotel=new HotelEntity();
        assertThrows(RuntimeException.class,()->HotelService.getHotelById(111));

    }*/

}
