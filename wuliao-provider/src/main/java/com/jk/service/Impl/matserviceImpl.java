package com.jk.service.Impl;

import com.jk.service.matservice;
import com.jk.entity.PageResult;
import com.jk.entity.kmaterials;
import com.jk.mapper.kmaterialsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class matserviceImpl implements matservice {
    @Resource
    private kmaterialsMapper kmaterialsMapper;

    @Override
    public PageResult find(Integer page, Integer rows, kmaterials kma) {
        List<kmaterials> kmlist=kmaterialsMapper.findpage(page,rows,kma);
      long total=kmaterialsMapper.count(kma);
      long totalPage=total%rows == 0 ? total/rows : (total/rows + 1);
        return new PageResult(total,kmlist,page,rows,totalPage);
    }
}
