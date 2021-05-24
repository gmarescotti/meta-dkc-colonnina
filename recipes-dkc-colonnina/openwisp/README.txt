# pipoe -y python3 --package openw
isp-controller
Gathering info:
  openwisp-controller
Failed to translate license: GPL3
Please enter a valid license name: GPLv3
  | celery
  |-- pytz
  |-- billiard
  |-- kombu
  |---- amqp
  |------ vine==5.0.0
  |-- click
  |-- click-didyoumean
  |-- click-repl
  |-- click-plugins
  |-- setuptools
Failed to translate license:
Please enter a valid license name: MIT
  | django-flat-json-widget
  | django-loci
  |-- Pillow==8.1.0
  |-- channels
  |---- Django
  |------ asgiref
  |------ sqlparse
  |---- daphne
  |------ twisted
  |-------- zope.interface
  |-------- constantly
  |-------- incremental
  |-------- Automat
  |---------- attrs
  |---------- six
  |-------- hyperlink
  |------ autobahn
  |-------- txaio
  |-------- cryptography
  |---------- cffi
  |------------ pycparser
  |-- django-leaflet
  |-- django
  |-- geopy
  |---- geographiclib
  |-- openwisp-utils
  |--  [ERROR] Failed to gather openwisp-utils (
django-filter (>=2.2.0<2.4.0) ; extra == 'rest'
                       ^
Parse error at line 1, column 23: expected EOF. trail: [versionspec]
)
  | django-model-utils
  | django-reversion
  | django-sortedm2m
  | django-taggit
  | django-x509
  |-- jsonfield
  |-- openwisp-utils
  |--  [ERROR] Failed to gather openwisp-utils (
django-filter (>=2.2.0<2.4.0) ; extra == 'rest'
                       ^
Parse error at line 1, column 23: expected EOF. trail: [versionspec]
)
  |-- pyopenssl
  |-- swapper
  | djangorestframework-gis
  |-- djangorestframework
  | netjsonconfig
  |-- jinja2
  |---- MarkupSafe
  |-- jsonschema
  |---- pyrsistent
  | openwisp-notifications
  |-- django-notifications-hq
  |-- markdown
  |-- openwisp-users
  |---- django-allauth
  |---- django-extensions
  |---- django-organizations
  |---- django-phonenumber-field
  |---- openwisp-utils
  |----  [ERROR] Failed to gather openwisp-utils (
django-filter (>=2.2.0<2.4.0) ; extra == 'rest'
                       ^
Parse error at line 1, column 23: expected EOF. trail: [versionspec]
)
  |---- packaging
Failed to translate license: BSD-2-Clause or Apache-2.0
Please enter a valid license name: Apache-2.0
  |------ pyparsing
  |---- phonenumbers
  |-- openwisp-utils
  |--  [ERROR] Failed to gather openwisp-utils (
django-filter (>=2.2.0<2.4.0) ; extra == 'rest'
                       ^
Parse error at line 1, column 23: expected EOF. trail: [versionspec]
)
  | openwisp-utils
  |  [ERROR] Failed to gather openwisp-utils (
django-filter (>=2.2.0<2.4.0) ; extra == 'rest'
                       ^
Parse error at line 1, column 23: expected EOF. trail: [versionspec]
)
  | paramiko
  |-- bcrypt
  |-- pynacl
  | scp
Generating recipes:
  python3-openwisp-controller_0.8.4.bb
  python3-celery_5.1.0.bb
  python3-pytz_2021.1.bb
  python3-billiard_3.6.4.0.bb
  python3-kombu_5.1.0.bb
  python3-amqp_5.0.6.bb
  python3-vine_5.0.0.bb
  python3-click_8.0.1.bb
  python3-click-didyoumean_0.0.3.bb
  python3-click-repl_0.1.6.bb
  python3-click-plugins_1.1.1.bb
  python3-setuptools_57.0.0.bb
  python3-django-flat-json-widget_0.1.2.bb
  python3-django-loci_0.4.2.bb
  python3-pillow_8.1.0.bb
  python3-channels_3.0.3.bb
  python3-django_3.2.3.bb
  python3-asgiref_3.3.4.bb
  python3-sqlparse_0.4.1.bb
  python3-daphne_3.0.2.bb
  python3-twisted_21.2.0.bb
  python3-zope-interface_5.4.0.bb
  python3-constantly_15.1.0.bb
  python3-incremental_21.3.0.bb
  python3-automat_20.2.0.bb
  python3-attrs_21.2.0.bb
  python3-six_1.16.0.bb
  python3-hyperlink_21.0.0.bb
  python3-autobahn_21.3.1.bb
  python3-txaio_21.2.1.bb
  python3-cryptography_3.4.7.bb
  python3-cffi_1.14.5.bb
  python3-pycparser_2.20.bb
  python3-django-leaflet_0.28.0.bb
  python3-django_3.2.3.bb
  python3-geopy_2.1.0.bb
  python3-geographiclib_1.50.bb
  python3-django-model-utils_4.1.1.bb
  python3-django-reversion_3.0.9.bb
  python3-django-sortedm2m_3.0.2.bb
  python3-django-taggit_1.4.0.bb
  python3-django-x509_0.9.4.bb
  python3-jsonfield_3.1.0.bb
  python3-pyopenssl_20.0.1.bb
  python3-swapper_1.1.2.post1.bb
  python3-djangorestframework-gis_0.17.bb
  python3-djangorestframework_3.12.4.bb
  python3-netjsonconfig_0.9.1.bb
  python3-jinja2_3.0.1.bb
  python3-markupsafe_2.0.1.bb
  python3-jsonschema_3.2.0.bb
  python3-pyrsistent_0.17.3.bb
  python3-openwisp-notifications_0.3.bb
  python3-django-notifications-hq_1.6.0.bb
  python3-markdown_3.3.4.bb
  python3-openwisp-users_0.5.1.bb
  python3-django-allauth_0.44.0.bb
  python3-django-extensions_3.1.3.bb
  python3-django-organizations_2.0.0.bb
  python3-django-phonenumber-field_5.1.0.bb
  python3-packaging_20.9.bb
  python3-pyparsing_2.4.7.bb
  python3-phonenumbers_8.12.23.bb
  python3-paramiko_2.7.2.bb
  python3-bcrypt_3.2.0.bb
  python3-pynacl_1.4.0.bb
  python3-scp_0.13.3.bb

PREFERRED_VERSIONS are available in: ./python3-versions.inc

