import React, { useState } from 'react';
import axios from 'axios';

import {TextField} from '@material-ui/core'

const SignInForm = () => {
  const [userid, setUserid] = useState('')
  const [password, setPassword] = useState('')
  const API_URL = "http://localhost:8080/api/users/";


  const authHeader = () => {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.accessToken) {
      return { Authorization: 'Bearer ' + user.accessToken }; // for Spring Boot back-end
      // return { 'x-access-token': user.accessToken };       // for Node.js Express back-end
    } else {
      return {};
    }
  }



  const login = (username, password) => {
    return axios
      .post(API_URL + "signin", {
        username,
        password
      })
      .then(response => {
        if (response.data.accessToken) {
          localStorage.setItem("user", JSON.stringify(response.data));
        }

        return response.data;
      });
  }

  const logout = () => {
    localStorage.removeItem("user");
  }

  const register = (username, email, password) => {
    return axios.post(API_URL + "signup", {
      username,
      email,
      password
    });
  }

  const getCurrentUser = () => {
    return JSON.parse(localStorage.getItem('user'));;
  }
 
  return (
    <>
      <div>
          <label>User ID</label>
          <TextField name="userid" required 
            onChange = { e => {setUserid(`${e.target.value}`) }}
            />
           <label>Password</label>
          <TextField name="password"
          onChange = { e => { setPassword(`${e.target.value}`) }}
          />
        </div>
        
        <button type="submit" onClick= {login}>Sign Up</button>
      </>
  );
};

export default SignInForm;
