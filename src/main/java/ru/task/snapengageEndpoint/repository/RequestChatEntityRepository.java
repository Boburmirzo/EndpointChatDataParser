package ru.task.snapengageEndpoint.repository;

import org.springframework.data.repository.CrudRepository;
import ru.task.snapengageEndpoint.domainobject.RequestDO;

import java.util.List;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
public interface RequestChatEntityRepository extends CrudRepository<RequestDO,Long> {
    List<RequestDO> findAll();
}
