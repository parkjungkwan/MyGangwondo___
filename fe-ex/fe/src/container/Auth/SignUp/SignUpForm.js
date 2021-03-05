import React, { useState } from 'react';
import axios from 'axios';
import { Redirect } from 'react-router-dom';
import { useForm, Controller } from 'react-hook-form';
import { MdLockOpen } from 'react-icons/md';
import { Input, Switch, Button } from 'antd';
import FormControl from 'components/UI/FormControl/FormControl';
import { AuthContext } from 'context/AuthProvider';
import { FieldWrapper, SwitchWrapper, Label } from '../Auth.style';
import {TextField} from '@material-ui/core'
const SignUpForm = () => {

  const [userid, setUserid] = useState('')
  const [password, setPassword] = useState('')
  const [username, setUsername] = useState('')
  const [email, setEmail] = useState('')
  const [gender, setGender] = useState('')
  const [birthday, setBirthday] = useState('')
  const [phoneNumber, setPhoneNumber] = useState('')
  const [preferGenre, setPreferGenre] = useState('')
  const register = e => {
    e.preventDefault()
    axios.post(`/users/save`,{
      userid, password, username, email, gender, birthday, phoneNumber,preferGenre
    })
    .then(resp => {})
    .catch(err => {})
  }
  return (
    <>
      <div>
          <label>User ID</label>
          <TextField name="userid" required 
            onChange = { e => {setUserid(`${e.target.value}`) }}
            /><br/>
          <label>Name</label>
          <TextField name="username" 
          onChange = { e => { setUsername(`${e.target.value}`) }}
          required />
        </div>
        <div>
          <label>Email Address</label>
          <TextField name="email" required 
          onChange = { e => { setEmail(`${e.target.value}`) }}
          />
        </div>
        <div>
          <label>Password</label>
          <TextField name="password"
          onChange = { e => { setPassword(`${e.target.value}`) }}
          />
        </div>
        <div>
          <label>Birthday</label>
          <TextField name="birthday"
          onChange = { e => { setBirthday(`${e.target.value}`) }}
          />
        </div>
        <button type="submit" onClick= {register}>Sign Up</button>
      </>
  );
};

export default SignUpForm;
