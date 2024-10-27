package com.Hotel.HotelManagement.service.interfac;

import com.Hotel.HotelManagement.dto.LoginRequest;
import com.Hotel.HotelManagement.dto.Response;
import com.Hotel.HotelManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
