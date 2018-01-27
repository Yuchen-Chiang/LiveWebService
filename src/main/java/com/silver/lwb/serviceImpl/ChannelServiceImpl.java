package com.silver.lwb.serviceImpl;

import com.silver.lwb.dao.ChannelProfileDao;
import com.silver.lwb.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service Implement of the Channel Service Interface.
 *
 * @author Yuchen Chiang
 */
@Service(value = "channelService")
public class ChannelServiceImpl implements ChannelService{

    @Autowired
    ChannelProfileDao channelProfileDao;

    public boolean createChannel() {
        return false;
    }

    public boolean isChannelExistsAndPermitted(String cName, String cSecretKey) {
        List<Integer> channel = channelProfileDao.isChannelExists(cName, cSecretKey);
        return !channel.isEmpty() && channelProfileDao.isChannelPermitted(channel.get(0));
    }

    @Override
    public void changeChannelPublishStaus(String cName) {

    }

    @Override
    public void increaseChannelPlayCount(String cName) {

    }

    @Override
    public void descreaseChannelPlayCount(String cName) {

    }
}
