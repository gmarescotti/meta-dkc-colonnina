
SUMMARY = "Geographic add-ons for Django Rest Framework"
HOMEPAGE = "https://github.com/openwisp/django-rest-framework-gis"
AUTHOR = "Douglas Meehan <django-rest-framework-gis@googlegroups.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eead3b15183a1b498cfb534debd9ac2f"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/4b/61/b9ad40954ce9f0c0be4e07f66b5b0d4e412f1d4aa34ef37120fbcce98401/djangorestframework-gis-0.17.tar.gz"
SRC_URI[md5sum] = "635bd854979c9fb831d8844b54f94754"
SRC_URI[sha256sum] = "d3b6aa6beef32f75811f815bda3bc7e9ea5d2f0306f9741cad5f3820d3973be7"

S = "${WORKDIR}/djangorestframework-gis-0.17"

DEPENDS += " "
RDEPENDS_${PN} = "python3-djangorestframework"

BBCLASSEXTEND = "native nativesdk"
