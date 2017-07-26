/**
 * Created by taras on 7/3/2017.
 */
var app = angular.module('email_app', []);

app.controller('emailCtrl',['$scope', '$http', function ($scope, $http) {

    $scope.email = {
        id : '',
        name : ''
    };

    $scope.emails = [];

    $scope.save = function () {
        $scope.emails.push($scope.email);

        $http.post('/emails', $scope.email).then(

            function (res) {
                console.log(res);
            },
            function (err) {
                console.log(err);
            }
        )
    }


}] )