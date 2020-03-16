package com.chtc.supervision.repository;

import com.chtc.supervision.entity.HomeWork;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface HomeWorkRepository extends PagingAndSortingRepository<HomeWork, String> {
    Page<HomeWork> findAll(Specification<HomeWork> specification, Pageable pageable);

    @Query(value = "select * from homework where student_id = :studentId", nativeQuery = true)
    List<HomeWork> findHomeWorkByStudentId(@Param("studentId") String studentId);

    @Query(value = "select * from homework where teacher_id = :teacherId", nativeQuery = true)
    List<HomeWork> findHomeWorkByTeacherId(@Param("teacherId") String teacherId);

    @Transactional
    @Modifying
    @Query(value = "delete from homework WHERE id= :id", nativeQuery = true)
    void deleteHomeWorkById(@Param("id") String id);

    @Transactional
//    @Modifying
//    @Query(value = "UPDATE homework SET isDelete=1 WHERE id= :id", nativeQuery = true)
//    void updateHomeWorkById(@Param("homework") HomeWork homework);
//

    List<HomeWork> findHomeWorkById(String id);
}
