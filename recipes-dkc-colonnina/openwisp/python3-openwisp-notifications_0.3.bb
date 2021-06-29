
SUMMARY = "Notifications module of OpenWISP"
HOMEPAGE = "http://openwisp.org"
AUTHOR = "Gagan Deep <pandafy.dev@gmail.com>"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/56/65/9e41557dcfccbfbe30c1fc3cd475e62849c3b3591ea31f66a18eaf44ba13/openwisp-notifications-0.3.tar.gz"
SRC_URI[md5sum] = "3fd27e1e9424c769b268d868369ffd17"
SRC_URI[sha256sum] = "3ac9d7740fc156ba0057d5cf12f23e55c03a70ba26b405da52d8e1204a171050"

S = "${WORKDIR}/openwisp-notifications-0.3"

DEPENDS += " "
RDEPENDS_${PN} = "python3-celery python3-channels python3-django-notifications-hq python3-markdown python3-openwisp-users python3-openwisp-utils python3-swapper"

BBCLASSEXTEND = "native nativesdk"
