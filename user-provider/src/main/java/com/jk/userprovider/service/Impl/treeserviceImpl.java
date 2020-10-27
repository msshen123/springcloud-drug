package com.jk.userprovider.service.Impl;

import com.jk.userprovider.entity.Ttree;
import com.jk.userprovider.mapper.TtreeMapper;
import com.jk.userprovider.service.treeservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class treeserviceImpl implements treeservice {

    @Resource
    private TtreeMapper TtreeMapper;
    @Override
    public List<Ttree> find() {
        int pid=0;
        return aa(pid);
    }

    private List<Ttree> aa(int pid) {
        List<Ttree>list=TtreeMapper.find(pid);
          for(Ttree tree:list){
              Integer id=tree.getId();
              List<Ttree>list1=aa(id);
              if (list1==null || list1.isEmpty()){
                  tree.setSelectable(true);
              }else{
                  tree.setSelectable(false);
                  tree.setNodes(list1);
              }
          }
        return list;
    }
}
