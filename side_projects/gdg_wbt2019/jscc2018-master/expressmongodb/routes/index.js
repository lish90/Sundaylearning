var express = require('express');
var router = express.Router();
var MongoClient = require('mongodb').MongoClient;

/* GET home page. 
 */
router.get('/', function(req, res, next) {
    res.render('index', {
        title: 'Behaviour Chart'
    });
});

/* 
TODO: Complete endpoint to retrieve airbnb listings
1. Insert mongo db database url
2. Insert database name
3. Insert collection name
4. Test endpoint at localhost:3000/airbnb
*/
router.get('/airbnb', function(req, res, next) {
    MongoClient.connect('mongodb+srv://everstina_1:sinaRay@cluster0-dwyjj.mongodb.net/test?retryWrites=true&w=majority',
        function(err, client) {
            if (err) throw err;
            var db = client.db('sample_airbnb');
            db.collection('<listingsAndReviews').find().limit(3).toArray(function(err, result) {
                if (err) throw err;
                res.json(result);
            });
        });
});


/* 
TODO: Complete endpoint to retrieve ONLY airbnb listings that have 7 BEDROOMS
1. Insert mongo db database url
2. Insert database name
3. Insert collection name
4. Insert filter query {..} in .find({}) method
4. Run App & Test endpoint at localhost:3000/sevenbed
*/
router.get('/sevenbed', function(req, res, next) {
    MongoClient.connect('mongodb+srv://everstina_1:sinaRay@cluster0-dwyjj.mongodb.net/test?retryWrites=true&w=majority', function(err, client) {
        if (err) throw err;
        var db = client.db('sample_airbnb');
        db.collection('listingsAndReviews').find({
            'bedroom': 7
        }).limit(7).toArray(function(err, result) {
            if (err) throw err;
            res.json(result);
        });
    });
});

/* TODO: Make up your own endpoint */
router.get('/', function(req, res, next) {});

module.exports = router;