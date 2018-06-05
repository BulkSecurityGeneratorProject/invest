(function () {
    'use strict';

    angular
        .module('investApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider.state('cci', {
            parent: 'app',
            url: '/cci',
            data: {
                authorities: [],
                pageTitle: 'global.menu.cci'
            },
            resolve: {
                chartData: function ($http) {
                    return $http.get('/api/stocks-resource/get-stocks').then(function (response) {
                        return response.data;
                    });
                }
            },
            views: {
                'content@': {
                    templateUrl: 'app/cci/cci.html',
                    controller: 'CciController',
                    controllerAs: 'vm'
                }
            }
        });
    }
})();
