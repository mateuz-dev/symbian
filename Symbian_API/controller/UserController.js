const express = require('express');
const User = require('../model/User');
const router = express.Router();

router.post('/user/createUser', (req, res) => {
    console.log('a')

    const {name, last_name, email, phone, password} = req.body

    User.create({
        name,
        last_name,
        email,
        phone,
        password
    }).then(() => res.status(200).json({"msg": "success"}))
});

module.exports = router;