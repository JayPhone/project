package com.jayphone.project.service;

import com.jayphone.project.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int areaId);
}
