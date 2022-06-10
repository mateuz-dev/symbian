const Sequelize = require('sequelize')

const connection = require('../database/database')

const User = connection.define(
    'tbl_user',
    {
        id_user: {
            type: Sequelize.INTEGER(10),
            primaryKey: true,
            autoIncrement: true
        },

        name: {
            type: Sequelize.STRING(200),
            allowNull: false
        },

        last_name: {
            type: Sequelize.STRING(200),
            allowNull: false
        },

        email: {
            type: Sequelize.STRING(200),
            allowNull: false,
            unique: true
        },
        
        phone: {
            type: Sequelize.STRING(16),
            allowNull: false
        },

        password: {
            type: Sequelize.STRING(8),
            allowNull: false
        }
    }
)

// User.sync({force: true})

module.exports = User