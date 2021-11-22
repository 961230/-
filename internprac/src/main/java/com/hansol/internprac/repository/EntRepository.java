package com.hansol.internprac.repository;

import com.hansol.internprac.domain.Ent;
import com.hansol.internprac.dto.EntDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EntRepository extends JpaRepository<Ent, String> {

    @Query(value = "select e.id, e.title from ent e where e.title=?1",
            countQuery="select count(e.id) from ent e where e.title=?1",
            nativeQuery = true)
    Page<Object[]> findBytitle(@Param("t") String title, Pageable pageable);


}
