package com.example.demo.repository;

import com.example.demo.service.drugseller;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface drugsellerrepo extends JpaRepository<drugseller,Long> {
}
