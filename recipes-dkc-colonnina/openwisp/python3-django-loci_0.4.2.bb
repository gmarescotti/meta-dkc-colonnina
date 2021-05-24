
SUMMARY = "Reusable django-app for outdoor and indoor mapping"
HOMEPAGE = "http://openwisp.org"
AUTHOR = "Federico Capoano <support@openwisp.io>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b12169769c27af92363a4f27662aeea5"

SRC_URI = "https://files.pythonhosted.org/packages/7b/7c/ada4dc4023750f8b98244d1bb9334049da2919d5812da16d829237b39e6f/django-loci-0.4.2.tar.gz"
SRC_URI[md5sum] = "86021e53c81f0c217f2a21c88b7e1d27"
SRC_URI[sha256sum] = "00010c26d0b6f161f2a7610c123c224f499cebd79907a4f4bf6459a40b78acc0"

S = "${WORKDIR}/django-loci-0.4.2"

RDEPENDS_${PN} = "python3-pillow python3-channels python3-django-leaflet python3-django python3-geopy python3-openwisp-utils"

inherit setuptools3
