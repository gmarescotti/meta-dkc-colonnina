
SUMMARY = "Use Leaflet in your django projects"
HOMEPAGE = "https://github.com/makinacorpus/django-leaflet"
AUTHOR = "Mathieu Leplatre <mathieu.leplatre@makina-corpus.com>"
LICENSE = "LGPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/ce/53/fdfddc8c7037c3f0466ca7be2a7b0348a09a75f44e70db28c467a2dfeddd/django-leaflet-0.28.0.tar.gz"
SRC_URI[md5sum] = "7097e93afa85077a79424d170f494425"
SRC_URI[sha256sum] = "dec0812e50c9bbb28a2967f18201b7bda5fd7ae7b7897fb1923a28769bbd01d9"

S = "${WORKDIR}/django-leaflet-0.28.0"

RDEPENDS_${PN} = "python3-django"

inherit setuptools3
