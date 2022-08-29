# webshop
spring-boot project

# erd-diagram
![Alt text](https://github.com/xuantoan2001/webshop/blob/main/erd-diagram.png?raw=true?raw=true "Title")

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
| GET   | /api-catalog | Get all catalog |  |
| POST  | /api-catalog | Create new catalog  | /api-catalog |
| PUT  | /api-catalog/{catalogID} | Update catalog by id | /api-catalog/1 |
| DELETE  | /api-catalog | Delete catalog by array ids | /api-catalog |
Request Body Create/UPDATE Catalog API
```
{
        "created": 1641509311,
        "catalogName": "Ao Vest Nam",
        "description": "mo ta",
        "parentID": 7,
        "sortOrder": 1
}
```
### Product

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-product | Get all product |  |
| GET  | /api-product/{productID} | Get product by ID |  |
| GET  | /api-product/catalog/{catalogID} | Get list product by catalog ID |  |
| POST  | /api-product | Create new product  | /api-product |
| PUT  | /api-product/{productID} | Update product by id | /api-product/1 |
| DELETE  | /api-product | Delete product by array ids | /api-product |
Request Body Create/UPDATE Comment API
```
{
    "created": 1493983674,
    "productName": " Áo thun nam POLO trơn vải cá sấu cotton cao cấp ngắn tay cực sang trọng",
    "catalog": {
        "id" : 10
    },
    "content": "123",
    "price": 99000,
    "discount": 7000,
    "imageLink": "sp13_1.jpg",
    "imageList": "[\"sp5_2.jpg\",\"sp5_3.jpg\",\"sp5_4.jpg\"]",
    "viewCount": 0,
    "buyedCount": 0,
    "rateTotal": 0,
    "rateCount": 0
}
```
### Comment

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-comment | Get all comment | /api-comment  |
| GET  | /api-comment/{commentID} | Get comment by ID | /api-comment/1 |
| GET  | /api-comment/product/{productID} | Get comment by productID | /api-comment/product/1 |
| GET  | /api-comment/user/{userID} | Get comment by userID |  /api-comment/user/1|
Request Body Create/UPDATE Comment API
```
{
    "created": 1642006055,
    "productComment": {
        "id": 9
    },
    "content": "Hay quaaaaa13!",
    "imageLink": "sp6_2.jpg",
    "rate": 4,
    "userComment": {
        "id": 3
    }
}
```
Request Body DELETE API
```
["4","5"]
``` 
### Bills

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-bills | Get all bills |  |
| GET  | /api-bills/{billsID} | Get bills by ID |  |
| GET  | /api-bills/user/{userID} | Get bills by user ID |  |
Request Body Create/UPDATE Bills API
```
{
        "created": 1609454911,
        "status": 0,
        "message": " Phí Ship: 132,000VNĐ",
        "amount": 123000.0,
        "payment": "",
        "user": {
            "id": 1
        }
}
```
### BillsDetail

| Method | Url | Decription | URL | 
| ------ | --- | ---------- | --------------------------- |
| GET   | /api-billsdetail | Get all bills detail |  |
| GET  | /api-billsdetail/{billsdetailID} | Get bills detail by ID |  |
| GET  | /api-billsdetail/bills/{billsID} | Get bills details by bills ID |  |
Request Body Create/UPDATE BillsDetail API
```
{
    "bill": {
        "id": 15
    },
    "quantity": 3,
    "amount": 200000.0,
    "status": 0,
    "product": {
        "id": 1
    }
}
```
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