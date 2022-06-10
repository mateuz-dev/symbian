const express = require('express');
const app = express();
const User = require('./model/User')

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const userController = require('./controller/UserController');
app.use('/', userController);

app.listen(3000, () => console.log('working on http://localhohost:3000'));