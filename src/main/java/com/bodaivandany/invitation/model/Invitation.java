package com.bodaivandany.invitation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "invitation")
public class Invitation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInvitation;

    @Column(name = "invitation_to")
    private String invitationTo;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "guests")
    private short noGuests;

    @Column(name = "confirmed_guests")
    private short noConfirmedGuests;

    @Column(name = "confirmed_rejected")
    private short invitationStatus;

    @Column(name = "invitation_url")
    private String invitationUrl;

}
