package com.user.auth.transformer;

import com.user.auth.dto.NodeDto;
import com.user.auth.entity.NodeEntity;

public class NodeTransformer {

    public static NodeEntity getNodeEntity(NodeDto nodeDto){
        NodeEntity nodeEntity = new NodeEntity();
        if(nodeDto.getId()!=null){
            nodeEntity.setId(Long.parseLong(nodeDto.getId()));
        }
        if(nodeDto.getNodeName()!=null){
            nodeEntity.setName(nodeDto.getNodeName());
        }
       if(nodeDto.getMapName()!=null){
            nodeEntity.setMapName(nodeDto.getMapName());
        }
        return nodeEntity;
    }

    public static  NodeDto getNodeDto(NodeEntity  nodeEntity){
            NodeDto nodeDto  = new NodeDto();
            if(nodeEntity.getId()!=null){
                nodeDto.setId(nodeEntity.getId().toString());
            }
            if(nodeEntity.getName()!= null){
                nodeDto.setNodeName(nodeDto.getNodeName());
            }
             if(nodeEntity.getMapName()!= null){
                nodeDto.setMapName(nodeDto.getMapName());
            }
            return nodeDto;
    }
}
