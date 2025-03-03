package com.dipankar.service;

import com.dipankar.model.Home;
import com.dipankar.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
