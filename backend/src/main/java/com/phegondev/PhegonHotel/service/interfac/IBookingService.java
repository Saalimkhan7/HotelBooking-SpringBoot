package com.Hotel.HotelManagement.service.interfac;

import com.Hotel.HotelManagement.dto.Response;
import com.Hotel.HotelManagement.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
