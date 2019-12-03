package com.training.dao;

import java.util.List;

import com.training.beans.Bike;
import com.training.beans.SellBike;

public interface SellBikeDao {

List<Bike>  showdetails(SellBike b);

void insertdetails(SellBike b);

}
