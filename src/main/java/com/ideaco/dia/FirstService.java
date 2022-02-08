package com.ideaco.dia;

import com.ideaco.dia.request.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FirstService {

    @Autowired
    private JobRepository jobRepository;

    public FirstService(JobRepository jobRepository){
        this.jobRepository = jobRepository;
    }

    public String sendMessage(String message){
        return "Sending message "+message;
    }

    public UserModel getJobById(int userId){
        return jobRepository.findById(userId).get();
    }

    //RegisterUserRequest class untuk variabel
    public UserModel createUser(RegisterUserRequest registerUserRequest){
        UserModel userModel = new UserModel();
        userModel.setUserName(registerUserRequest.getUserName());
        userModel.setUserEmail(registerUserRequest.getUserEmail());
        userModel.setUserAddress(registerUserRequest.getUserAddress());
        userModel.setUserPassword(registerUserRequest.getUserPassword());
        userModel.setUserPhone(registerUserRequest.getUserPhone());
        userModel.setUserResume(registerUserRequest.getUserResume());

        //save to table
        return jobRepository.save(userModel);
    }

}
