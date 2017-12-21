package com.club.service;

import com.club.entity.VideoInfo;

import java.util.List;

/**
 * Created by rrd on 2016/4/5.
 */
public interface UserBasicService {

    /**
     * 搜索栏获取匹配记录
     * @param word
     * @return
     */
    public List<VideoInfo> getSearchVideo(String word);


}
