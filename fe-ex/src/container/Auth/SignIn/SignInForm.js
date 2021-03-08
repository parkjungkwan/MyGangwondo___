import React, { useState } from 'react';
import axios from 'axios';

import {TextField} from '@material-ui/core'

const SignInForm = () => {
  const [userid, setUserid] = useState('')
  const [password, setPassword] = useState('')

  const login = e => {
    e.preventDefault()
    axios.post(`/users/login`,{
      userid, password
    })
    .then(resp => {

    })
    .catch(err => {
      
    })
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
