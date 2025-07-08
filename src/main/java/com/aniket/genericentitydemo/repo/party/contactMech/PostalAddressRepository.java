package com.aniket.genericentitydemo.repo.party.contactMech;

import com.aniket.genericentitydemo.model.party.contactMech.PostalAddress;
import com.aniket.genericentitydemo.repo.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostalAddressRepository extends GenericRepository<PostalAddress, Long> {
}
