# webshop
spring-boot project

## Explore Rest APIs

The app defines following CRUD APIs.

### Account

| Method | Url | Decription | URL  | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-account | Get all account | /api-account |
| GET  | /api-account/{accountID} | Get account by ID | /api-account/1 |
| POST  | /api-account | Create new account  | /api-account |
| PUT  | /api-account/{accountID} | Update account by id | /api-account/1 |
| DELETE  | /api-account | Delete account by array ids | /api-account |

Request Body Create/UPDATE Account API
```
{  
    "created": 1661694265,
    "accountName": "Pham Xuan Toan",
    "email": "xuantoan12@gmail.com",
    "password": "81dc9bdb52d04dc20036dbd8313ed055",
    "avatar": "no-ava.png",
    "permissions": {
        "id": 1
    }
}
``` 
Request Body DELETE API
```
["4","5"]
``` 

### Catalog

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-catalog | Get all user |  |

### Product

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-product | Get all user |  |
| GET  | /api-product/{productID} | Get user by ID |  |


### Comment

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-comment | Get all comment | /api-comment  |
| GET  | /api-comment/{commentID} | Get comment by ID | /api-comment/1 |
| GET  | /api-comment/product/{productID} | Get comment by productID | /api-comment/product/1 |
| GET  | /api-comment/user/{userID} | Get comment by userID |  /api-comment/user/1|

### Bills

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-bills | Get all bills |  |
| GET  | /api-bills/{billsID} | Get bills by ID |  |

### BillsDetail

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-billsdetail | Get all bills detail |  |
| GET  | /api-billsdetail/{billsdetailID} | Get bills detail by ID |  |

### User

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-user | Get all user | /api-user |
| GET  | /api-user/{userID} | Get user by ID | /api-user/1 |
| POST  | /api-user | Create new user  | /api-user |
| PUT  | /api-user/{accountID} | Update user by id | /api-user/1 |
| DELETE  | /api-user | Delete user by array ids | /api-user |

Request Body Create/UPDATE Account API
``` 
{
    "created": 1638830911,
    "userName": "Xuân Toán",
    "email": "xuantoan123@gmail.com",
    "password": "81dc9bdb52d04dc20036dbd8313ed055",
    "phone": "0123456221",
    "address": ""
}
``` 