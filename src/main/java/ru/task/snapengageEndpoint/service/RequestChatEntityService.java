package ru.task.snapengageEndpoint.service;

import ru.task.snapengageEndpoint.domainobject.RequestDO;
import ru.task.snapengageEndpoint.exception.EntityNotFoundException;

import java.util.List;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
public interface RequestChatEntityService {

    List<RequestDO> listAllRequestChatEntity();

    void create(RequestDO requestDO);

    RequestDO find(Long requestDOId) throws EntityNotFoundException;
}
