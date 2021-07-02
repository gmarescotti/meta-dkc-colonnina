
SUMMARY = "OpenWISP 2 Controller"
HOMEPAGE = "http://openwisp.org"
AUTHOR = "Federico Capoano <federico.capoano@gmail.com>"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02836b4bb7aaeed283f626f6c2f39fa3"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/a1/f1/5c1c4172ab81a6afea6fa2d8f8e94bcb48db9fa4b94550ab8f51cc0f91ac/openwisp-controller-0.8.4.tar.gz"
SRC_URI[md5sum] = "ccf638eb7cd7293f3242615dc1dc8f3c"
SRC_URI[sha256sum] = "f44a2b84d5f5d3fbdcb42fed8e4760c6d1dadd9bdf9a13aff3c98c269943aa67"

S = "${WORKDIR}/openwisp-controller-0.8.4"

DEPENDS += " python3-setuptools-scm python3-setuptools-native"
RDEPENDS_${PN} = "python3-celery python3-django-flat-json-widget python3-django-loci python3-django-model-utils python3-django-reversion python3-django-sortedm2m python3-django-taggit python3-django-x509 python3-django python3-djangorestframework-gis python3-netjsonconfig python3-openwisp-notifications python3-openwisp-users python3-openwisp-utils python3-paramiko python3-scp python3-swapper python3-setuptools-scm"

BBCLASSEXTEND = "native nativesdk"
