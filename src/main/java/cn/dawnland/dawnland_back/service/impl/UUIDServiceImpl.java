package cn.dawnland.dawnland_back.service.impl;

import cn.dawnland.dawnland_back.mapper.UUIDMapper;
import cn.dawnland.dawnland_back.service.UUIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UUIDServiceImpl implements UUIDService {

    @Autowired
    private UUIDMapper uuidMapper;

    @Override
    public String findNameByUUID(String uuid) {
        return uuidMapper.findNameByUUID(uuid);
    }

    @Override
    public String findUUIDByName(String name) {
        return uuidMapper.findUUIDByName(name);
    }
}
