(function() {
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
