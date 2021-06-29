
SUMMARY = "Use Leaflet in your django projects"
HOMEPAGE = "https://github.com/makinacorpus/django-leaflet"
AUTHOR = "Mathieu Leplatre <mathieu.leplatre@makina-corpus.com>"
LICENSE = "LGPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/6f/d5/9fd9f27ee8bacabe94c1b1f35c730f3694be73e7d00afab6deebcfe492a7/django-leaflet-0.28.1.tar.gz"
SRC_URI[md5sum] = "bc4111f0717248b82f4952f34f7c87b7"
SRC_URI[sha256sum] = "0fff2322c0cc1d008e3a18f067df736a937566a1ee1a6ce2e8ad298c4c713bb8"

S = "${WORKDIR}/django-leaflet-0.28.1"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django"

BBCLASSEXTEND = "native nativesdk"
