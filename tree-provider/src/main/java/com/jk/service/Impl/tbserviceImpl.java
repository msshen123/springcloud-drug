package com.jk.service.Impl;

import com.jk.entity.tbtree;
import com.jk.mapper.tbtreeMapper;
import com.jk.service.tbservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class tbserviceImpl implements tbservice {
    @Resource
    private tbtreeMapper tbtreeMapper;
    @Override
    public List<tbtree> find() {
       int pid=0;
        return aa(pid);
    }

    private List<tbtree> aa(int pid) {
        List<tbtree>list=tbtreeMapper.find(pid);

         for (tbtree tree:list){
             Integer id=tree.getId();
             List<tbtree> list1=aa(id);
             if(list1==null || list1.isEmpty()){
                 tree.setSelectable(true);

             }else{
                 tree.setSelectable(false);
                 tree.setNodes(list1);
             }
         }
        return list;
    }
}
