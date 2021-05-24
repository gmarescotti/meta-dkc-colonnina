
SUMMARY = "Django Flat JSON Key/Value Widget"
HOMEPAGE = "https://github.com/openwisp/django-flat-json-widget"
AUTHOR = "Federico Capoano <federico.capoano@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a897544ec13491d0753d297d0b5a2d"

SRC_URI = "https://files.pythonhosted.org/packages/36/9e/c50c742f982b5f23c523463b650560b6704d5e2404723a45d0c4fdde07e1/django-flat-json-widget-0.1.2.tar.gz"
SRC_URI[md5sum] = "af67ac8c5ca4046139dc7352afefdc99"
SRC_URI[sha256sum] = "32630ccd6284f6e1c83412d443dcf8ffe8d3302392bcf1bd4d5b198053494933"

S = "${WORKDIR}/django-flat-json-widget-0.1.2"

RDEPENDS_${PN} = ""

inherit setuptools3
