angular.module('ParkSystem')
    .factory("UserService",['$http', function UserServiceFactory($http){
        return {
            create: function(reg){
                return $http.post('registration',reg).success(function(data){
                    console.log("ok");
                });
            }
        }

    }]);