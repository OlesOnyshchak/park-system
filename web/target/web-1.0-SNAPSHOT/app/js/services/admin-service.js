angular.module('ParkSystem')
    .factory("AdminService",['$http', function AdminServiceFactory($http){
        return {
            create: function(reg){
                return $http.post('save-job',reg).success(function(data){
                    console.log("ok");
                });
            }
        }

    }]);
