package ru.task.snapengageEndpoint.service;

import org.springframework.stereotype.Service;
import ru.task.snapengageEndpoint.domainobject.RequestDO;
import ru.task.snapengageEndpoint.exception.EntityNotFoundException;
import ru.task.snapengageEndpoint.repository.RequestChatEntityRepository;

import java.util.List;
import java.util.Optional;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@Service
public class RequestChatEntityServiceImpl implements RequestChatEntityService {

    private final RequestChatEntityRepository requestChatEntityRepository;

    public RequestChatEntityServiceImpl(final RequestChatEntityRepository requestChatEntityRepository){
        this.requestChatEntityRepository = requestChatEntityRepository;
    }

    @Override
    public List<RequestDO> listAllRequestChatEntity() {
        return requestChatEntityRepository.findAll();
    }

    @Override
    public void create(RequestDO requestDO) {
        requestChatEntityRepository.save(requestDO);
    }

    @Override
    public RequestDO find(Long requestDOId){
        Optional<RequestDO> requestDO =  requestChatEntityRepository.findById(requestDOId);
        if(!requestDO.isPresent()){
            try {
                throw new EntityNotFoundException("Could not find entity with id: " + requestDOId);
            } catch (EntityNotFoundException e) {
                e.printStackTrace();
            }
        }
        return requestDO.get();
    }
}
