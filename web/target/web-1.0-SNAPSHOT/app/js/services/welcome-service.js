angular.module('ParkSystem')
        .factory("WelcomeService",['$http', function WelcomeServiceFactory($http){
        return {
            create: function(reg){
               return $http.post('registration',reg).success(function(data){
                    console.log("ok");
                });
            }
        }

    }]);
