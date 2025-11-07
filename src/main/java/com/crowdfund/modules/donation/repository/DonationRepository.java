package com.yourapp.modules.donation.repository;


import com.yourapp.modules.donation.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DonationRepository extends JpaRepository<Donation, Long> {
List<Donation> findByPostId(Long postId);
}