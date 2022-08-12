package com.jayphone.project.dao;

import com.jayphone.project.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);
}
